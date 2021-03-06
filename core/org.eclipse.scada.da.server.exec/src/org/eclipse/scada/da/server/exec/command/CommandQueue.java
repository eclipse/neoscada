/*******************************************************************************
 * Copyright (c) 2009, 2010 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.server.exec.command;

import org.eclipse.scada.da.server.browser.common.FolderCommon;
import org.eclipse.scada.da.server.exec.Hive;

public interface CommandQueue
{
    /**
     * Add a command to the queue
     * @param command the command to add
     * @param period the min delay between execution
     */
    public void addCommand ( SingleCommand command, int period );

    /**
     * Remove a command from the queue
     * @param command
     */
    public void removeCommand ( SingleCommand command );

    public void start ( Hive hive, FolderCommon baseFolder );

    public void stop ();
}
