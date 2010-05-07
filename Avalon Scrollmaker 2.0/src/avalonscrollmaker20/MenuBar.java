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
  private BMenu actionsMenu;
    private BMenuItem printItem;
    private BMenuItem resetItem;
    private BMenuItem exitItem;
  private BMenu helpMenu;
    private BMenuItem dbItem;
    private BMenuItem aboutItem;
    private BMenuItem supportItem;

  private BMenu modeMenu;
    private BMenuItem simpleItem;
    private BMenuItem designerItem;

  public MenuBar()
  {
    actionsMenu = new BMenu( "Actions" );
      printItem = new BMenuItem( "Print", new Shortcut( 'P', Shortcut.CTRL_MASK ) );
        printItem.setActionCommand( "print" );
      resetItem = new BMenuItem( "Reset", new Shortcut( 'R', Shortcut.CTRL_MASK ) );
        resetItem.setActionCommand( "reset" );
      exitItem = new BMenuItem( "Exit", new Shortcut( 'Q', Shortcut.CTRL_MASK ) );
        exitItem.setActionCommand( "exit" );

    actionsMenu.add( printItem );
    actionsMenu.add( resetItem );
    actionsMenu.add( new BSeparator() );
    actionsMenu.add( exitItem );

    helpMenu = new BMenu( "Help" );
      dbItem = new BMenuItem( "Use 050910 Database" );
        dbItem.setActionCommand( "useDB" );
      aboutItem = new BMenuItem( "About" );
        aboutItem.setActionCommand( "about" );
      supportItem = new BMenuItem( "Contact Support" );
        supportItem.setActionCommand( "support" );
    
    helpMenu.add( dbItem );
    helpMenu.add( new BSeparator() );
    helpMenu.add( aboutItem );
    helpMenu.add( supportItem );
    
    modeMenu = new BMenu( "Menu" );
      simpleItem = new BMenuItem( "Simple" );
        simpleItem.setActionCommand( "simple" );
      designerItem = new BMenuItem( "Designer" );
        designerItem.setActionCommand( "designer" );

    modeMenu.add( simpleItem );
    modeMenu.add( new BSeparator() );
    modeMenu.add( designerItem );

    this.add( actionsMenu );
    this.add( helpMenu );
    this.add( modeMenu );
  }
}