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
package org.kitteh.irc.client.library.exception;

import javax.annotation.Nonnull;

/**
 * Fired upon failure to process a single ISUPPORT message.
 */
public class KittehISupportProcessingFailureException extends Exception {
    private final String arg;

    /**
     * Constructs the disappointment.
     *
     * @param arg ISUPPORT line that failed
     */
    public KittehISupportProcessingFailureException(@Nonnull String arg) {
        super("Failed to process an ISUPPORT line: [" + arg + ']');
        this.arg = arg;
    }

    /**
     * Gets the ISUPPORT argument which could not be processed.
     *
     * @return the unprocessed argument
     */
    @Nonnull
    public String getArg() {
        return this.arg;
    }
}
