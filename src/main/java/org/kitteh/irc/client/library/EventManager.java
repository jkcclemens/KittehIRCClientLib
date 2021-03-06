/*
 * * Copyright (C) 2013-2015 Matt Baxter http://kitteh.org
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.kitteh.irc.client.library;

import net.engio.mbassy.listener.Handler;

import javax.annotation.Nonnull;
import java.util.Set;

/**
 * Processes and registers events for a single {@link Client} instance. This
 * event manager utilizes MBassador, a lightweight event bus.
 */
public interface EventManager {
    /**
     * Calls an event, triggering any registered methods for the event class.
     *
     * @param event event to call
     * @throws IllegalArgumentException for a null event
     */
    void callEvent(@Nonnull Object event);

    /**
     * Gets all registered listener objects.
     *
     * @return a set of objects
     */
    @Nonnull
    Set<Object> getRegisteredEventListeners();

    /**
     * Registers annotated with {@link Handler} with sync invocation,
     * provided they have a single parameter. This parameter is the event.
     *
     * @param listener listener in which to register events
     * @throws IllegalArgumentException for a null listener
     */
    void registerEventListener(@Nonnull Object listener);

    /**
     * Unregisters a listener.
     *
     * @param listener listener to unregister
     * @throws IllegalArgumentException for a null listener
     */
    void unregisterEventListener(@Nonnull Object listener);
}
