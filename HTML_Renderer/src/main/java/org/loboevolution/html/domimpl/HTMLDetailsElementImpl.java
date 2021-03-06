/*
    GNU GENERAL LICENSE
    Copyright (C) 2014 - 2018 Lobo Evolution

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    verion 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General License for more details.

    You should have received a copy of the GNU General Public
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    

    Contact info: ivan.difrancesco@yahoo.it
 */
package org.loboevolution.html.domimpl;


import org.loboevolution.w3c.html.HTMLDetailsElement;

/**
 * The Class HTMLDetailsElementImpl.
 */
public class HTMLDetailsElementImpl extends HTMLElementImpl implements HTMLDetailsElement {

	/**
	 * Instantiates a new HTML details element impl.
	 *
	 * @param name
	 *            the name
	 */
	public HTMLDetailsElementImpl(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.loboevolution.w3c.html.HTMLDetailsElement#getOpen()
	 */
	@Override
	public boolean getOpen() {
		String open = this.getAttribute(OPEN);
		return OPEN.equalsIgnoreCase(open);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.loboevolution.w3c.html.HTMLDetailsElement#setOpen(boolean)
	 */
	@Override
	public void setOpen(boolean open) {
		this.setAttribute(OPEN, open ? OPEN : null);

	}

}
