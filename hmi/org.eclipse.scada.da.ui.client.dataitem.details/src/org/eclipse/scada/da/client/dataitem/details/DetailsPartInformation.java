/*******************************************************************************
 * Copyright (c) 2009, 2011 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.client.dataitem.details;

import org.eclipse.scada.da.client.dataitem.details.part.DetailsPart;

public class DetailsPartInformation
{
    private DetailsPart detailsPart;

    private String sortKey;

    private String label;

    public DetailsPart getDetailsPart ()
    {
        return this.detailsPart;
    }

    public void setDetailsPart ( final DetailsPart detailsPart )
    {
        this.detailsPart = detailsPart;
    }

    public String getSortKey ()
    {
        return this.sortKey;
    }

    public void setSortKey ( final String sortKey )
    {
        this.sortKey = sortKey;
    }

    public String getLabel ()
    {
        return this.label;
    }

    public void setLabel ( final String label )
    {
        this.label = label;
    }

}
