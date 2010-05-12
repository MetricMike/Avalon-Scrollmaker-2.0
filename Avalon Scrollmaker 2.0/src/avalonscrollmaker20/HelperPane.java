/*
 *  The MIT License
 * 
 *  Copyright 2010 Michael Weigle <michael.weigle@gmail.com>.
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package avalonscrollmaker20;

import buoy.widget.BButton;
import buoy.widget.BLabel;
import buoy.widget.FormContainer;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/**
 * @desc   GUI object holding information about the project and support options
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
class HelperPane extends FormContainer
{
  private BLabel emailSupportText;
  public BButton emailSupportButton;

  private URI mailtoURI;

  private String mailHTML = new String( "<html>To: <b>michael.weigle+support@gm"
                                      + "ail.com</b><br>Subject: <i>Avalon Scro"
                                      + "llMaker 2.0 Troubleshooting</i><br><br"
                                      + ">Hi,<br><br>[describe your issue here]"
                                      + "<br>[describe how you expect the progr"
                                      + "am to behave]<br>[describe how the pro"
                                      + "gram actually behaved]<br>[describe wh"
                                      + "at you did to reach this point]<br><br"
                                      + ">Thanks!<br>[your name]<br></html>" );

  public HelperPane()
  {
    super( 1, 2 );

    emailSupportText = new BLabel( mailHTML );
    emailSupportButton = new BButton( "Use the default mail application to send"
                                    + "the above email");

    this.add( emailSupportText, 0, 0 );
    this.add( emailSupportButton, 0, 1 );
  }

  private void invalid()
  {
    JOptionPane.showMessageDialog( null, "Can't access default mail application"
                                 + ". Please copy the above email into your pre"
                                 + "ferred email client.", "Error",
                                 JOptionPane.ERROR_MESSAGE );
  }

  public void mailto()
  {
    try
    {
      mailtoURI = new URI( "mailto:michael.weigle+support@gmail.com?subject"
                         + "=Avalon%20ScrollMaker%202.0%20Troubleshooting&b"
                         + "ody=Hi%2C%0D%0A%0D%0A%5Bdescribe%20your%20issu"
                         + "e%20here%5D%0D%0A%5Bdescribe%20how%20you%20expect%20"
                         + "the%20program%20to%20behave%5D%0D%0A%5Bdescribe%20ho"
                         + "w%20the%20program%20actually%20behaved%5D%0D%0A%5Bde"
                         + "scribe%20what%20you%20did%20to%20reach%20this%20poi"
                         + "nt%5D%0D%0A%0D%0AThanks%21%0D%0A%5Byour%20name%5D" );
    }
    catch ( URISyntaxException ex )
    {
      System.err.println( "Creating mailtoURI failed. Program exiting!" );
      invalid();
      return;
    }

    Desktop desktop = Desktop.getDesktop();
    if( Desktop.isDesktopSupported() && ( desktop.isSupported( Desktop.Action.MAIL ) ) )
    {
      try
      {
        desktop.mail( mailtoURI );
      }
      catch ( IOException ex )
      {
        invalid();
      }
    }
    else // Desktop is not supported or MAIL is not supported
      invalid();
  }

}
