/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.mime4j;

import java.io.IOException;
import java.io.InputStream;

/**
 * Input stream capable of reading lines of text. 
 */
public abstract class BufferingInputStream extends InputStream {

    /**
     * Reads one line of text into the given {@link ByteArrayBuffer}.
     *  
     * @param dst Destination
     * @return number of bytes copied or <code>-1</code> if the end of 
     * the stream has been reached.
     * 
     * @throws IOException in case of an I/O error.
     */
    public abstract int readLine(final ByteArrayBuffer dst) throws IOException;
    
    /**
     * Resets the internal state.
     */
    public abstract void reset();
    
}