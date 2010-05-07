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

import buoy.event.CommandEvent;
import buoy.event.WindowClosingEvent;
import buoy.widget.*;

/**
 * @desc   Displays the GUI
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class ScrollMaker extends BFrame
{
  private MenuBar menuBar;

  private BSplitPane viewerPane;
  private OverlayContainer contentPane;

    private BTabbedPane simpleContainer;
      private SimpleTab earthTab;
      private SimpleTab airTab;
      private SimpleTab fireTab;
      private SimpleTab waterTab;
      private SimpleTab nexusTab;
      private SimpleTab voidTab;

    private DesignerPane designerContainer;

  private Dashboard dashboardContainer;
    
  public ScrollMaker()
  {
    super( "Avalon Scrollmaker 2.0" );

    menuBar = new MenuBar();

    earthTab = new SimpleTab();
    airTab = new SimpleTab();
    fireTab = new SimpleTab();
    waterTab = new SimpleTab();
    nexusTab = new SimpleTab();
    voidTab = new SimpleTab();

    simpleContainer = new BTabbedPane( BTabbedPane.TOP );
      simpleContainer.add( earthTab, " Earth " );
      simpleContainer.add( airTab, " Air   " );
      simpleContainer.add( fireTab, " Fire  " );
      simpleContainer.add( waterTab, " Water " );
      simpleContainer.add( nexusTab, " Nexus " );
      simpleContainer.add( voidTab, " Void  " );

    designerContainer = new DesignerPane();

    contentPane = new OverlayContainer();
      contentPane.add( simpleContainer );
      contentPane.add( designerContainer );
      contentPane.setVisibleChild( designerContainer );

    dashboardContainer = new Dashboard();

    viewerPane = new BSplitPane( BSplitPane.VERTICAL, contentPane, dashboardContainer );
      viewerPane.setResizeWeight( 0.9 );

    this.setMenuBar( menuBar );
    this.setContent( viewerPane );

    setEventLinks();

    pack();
    setVisible( true );
  }

  private void setEventLinks()
  {
    this.addEventLink( WindowClosingEvent.class, this, "doQuit" );
    
    //menuBar.printItem.addEventLink( CommandEvent.class, this, "doPrint" );
    //menuBar.resetItem.addEventLink( CommandEvent.class, this, "doReset" );
    menuBar.exitItem.addEventLink( CommandEvent.class, this, "doQuit" );

    menuBar.simpleItem.addEventLink( CommandEvent.class, this, "switchMode" );
    menuBar.designerItem.addEventLink( CommandEvent.class, this, "switchMode" );
  }

  private void doQuit()
  {
    System.exit( 0 );
  }

  private void switchMode( CommandEvent ev )
  {
    if( ev.getWidget() == menuBar.simpleItem )
      contentPane.setVisibleChild( simpleContainer );
    else if( ev.getWidget() == menuBar.designerItem )
      contentPane.setVisibleChild( designerContainer );
  }

}
