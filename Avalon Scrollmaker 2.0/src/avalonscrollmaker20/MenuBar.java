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
import buoy.widget.BMenuBar;
import buoy.widget.BMenu;
import buoy.widget.BMenuItem;
import buoy.widget.BSeparator;
import buoy.widget.Shortcut;

/**
 * @desc   Object containing the GUI MenuBar for the ScrollMaker application
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class MenuBar extends BMenuBar
{
  public BMenu actionsMenu;
    public BMenuItem calcItem;
    public BMenuItem dbItem;
    public BMenuItem printItem;
    public BMenuItem resetItem;
    public BMenuItem exitItem;

  public BMenu modeMenu;
    public BMenuItem simpleItem;
    public BMenuItem designerItem;
    public BMenuItem helpItem;

  public MenuBar()
  {
    actionsMenu = new BMenu( "Actions" );
      calcItem = new BMenuItem( "Calculate", new Shortcut( 'K', Shortcut.CTRL_MASK ) );
      dbItem = new BMenuItem( "Use Internal Database" );
        dbItem.setEnabled( false );
      printItem = new BMenuItem( "Print", new Shortcut( 'P', Shortcut.CTRL_MASK ) );
      resetItem = new BMenuItem( "Reset", new Shortcut( 'R', Shortcut.CTRL_MASK ) );
      exitItem = new BMenuItem( "Exit", new Shortcut( 'Q', Shortcut.CTRL_MASK ) );

    actionsMenu.add( calcItem );
    actionsMenu.add( dbItem );
    actionsMenu.add( printItem );
    actionsMenu.add( new BSeparator() );
    actionsMenu.add( resetItem );
    actionsMenu.add( exitItem );
    
    modeMenu = new BMenu( "Modes" );
      simpleItem = new BMenuItem( "Simple" );
      designerItem = new BMenuItem( "Designer" );
      helpItem = new BMenuItem( "Help" );

    modeMenu.add( simpleItem );
    modeMenu.add( new BSeparator() );
    modeMenu.add( designerItem );
    modeMenu.add( new BSeparator() );
    modeMenu.add( helpItem );

    this.add( actionsMenu );
    this.add( modeMenu );
  }
}
