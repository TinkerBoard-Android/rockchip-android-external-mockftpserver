/*
 * Copyright 2007 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mockftpserver.stub.example;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;

/**
 * Simple FTP client code example.
 * 
 * @version $Revision: 88 $ - $Date: 2007-10-27 20:18:11 -0400 (Sat, 27 Oct 2007) $
 *
 * @author Chris Mair
 */
public class FtpWorkingDirectory {

    private String server;

    /**
     * Return the current working directory for the FTP account on the server
     * @return the current working directory
     * @throws SocketException
     * @throws IOException
     */
    public String getWorkingDirectory() throws SocketException, IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect(server);
        return ftpClient.printWorkingDirectory();
    }

    /**
     * Set the hostname of the FTP server
     * @param server - the hostname of the FTP server
     */
    public void setServer(String server) {
        this.server = server;
    }
    
}