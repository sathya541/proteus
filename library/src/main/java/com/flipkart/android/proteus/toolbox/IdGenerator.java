/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Flipkart Internet Pvt. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.flipkart.android.proteus.toolbox;

import android.os.Parcelable;

/**
 * IdGeneratorImpl
 * <p>
 * Simulates the R class. Useful to given unique ID for use in {@link android.view.View#setId(int)} method.
 * An ID which doesn't conflict with aapt's ID is ensured. Please ensure that all dynamic ID call go through
 * this class to ensure uniqueness with other dynamic IDs.
 * </p>
 *
 * @author aditya.sharat
 */
public interface IdGenerator extends Parcelable {
    /**
     * Generates and returns a unique id, for the given key.
     * If key exists, returns old value.
     * Ensure that all
     *
     * @param id the value for which the ID is returns.
     * @return a unique ID integer for use with {@link android.view.View#setId(int)}.
     */
    int getUnique(String id);
}
