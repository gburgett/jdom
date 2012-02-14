/*--

 Copyright (C) 2012 Jason Hunter & Brett McLaughlin.
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions, and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions, and the disclaimer that follows
    these conditions in the documentation and/or other materials
    provided with the distribution.

 3. The name "JDOM" must not be used to endorse or promote products
    derived from this software without prior written permission.  For
    written permission, please contact <request_AT_jdom_DOT_org>.

 4. Products derived from this software may not be called "JDOM", nor
    may "JDOM" appear in their name, without prior written permission
    from the JDOM Project Management <request_AT_jdom_DOT_org>.

 In addition, we request (but do not require) that you include in the
 end-user documentation provided with the redistribution and/or in the
 software itself an acknowledgement equivalent to the following:
     "This product includes software developed by the
      JDOM Project (http://www.jdom.org/)."
 Alternatively, the acknowledgment may be graphical using the logos
 available at http://www.jdom.org/images/logos.

 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE JDOM AUTHORS OR THE PROJECT
 CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 SUCH DAMAGE.

 This software consists of voluntary contributions made by many
 individuals on behalf of the JDOM Project and was originally
 created by Jason Hunter <jhunter_AT_jdom_DOT_org> and
 Brett McLaughlin <brett_AT_jdom_DOT_org>.  For more information
 on the JDOM Project, please see <http://www.jdom.org/>.

 */

package org.jdom2.contrib.dom;

import org.w3c.dom.CharacterData;
import org.w3c.dom.DOMException;

import org.jdom2.Content;
import org.jdom2.Namespace;

abstract class JSimpleCharacterContent extends JSimpleContent implements CharacterData {

	public JSimpleCharacterContent(final JDocument topdoc, final JParent parent,
			final Content content, final Namespace[] nstack) {
		super(topdoc, parent, content, nstack);
	}

	@Override
	public final String getNodeValue() throws DOMException {
		return getData();
	}

	@Override
	public final String getTextContent() throws DOMException {
		return getData();
	}

	@Override
	public final String getData() throws DOMException {
		return shadow.getValue();
	}

	@Override
	public final void setData(final String data) throws DOMException {
		throw new DOMException(
				DOMException.NO_MODIFICATION_ALLOWED_ERR, "JDOM Wrapper");
	}

	@Override
	public final int getLength() {
		return getData().length();
	}

	@Override
	public final String substringData(final int offset, final int count) throws DOMException {
		return getData().substring(offset, offset + count);
	}

	@Override
	public final void appendData(final String arg) throws DOMException {
		throw new DOMException(
				DOMException.NO_MODIFICATION_ALLOWED_ERR, "JDOM Wrapper");
	}

	@Override
	public final void insertData(final int offset, final String arg) throws DOMException {
		throw new DOMException(
				DOMException.NO_MODIFICATION_ALLOWED_ERR, "JDOM Wrapper");
	}

	@Override
	public final void deleteData(final int offset, final int count) throws DOMException {
		throw new DOMException(
				DOMException.NO_MODIFICATION_ALLOWED_ERR, "JDOM Wrapper");
	}

	@Override
	public final void replaceData(final int offset, final int count, final String arg)
			throws DOMException {
		throw new DOMException(
				DOMException.NO_MODIFICATION_ALLOWED_ERR, "JDOM Wrapper");
	}

}