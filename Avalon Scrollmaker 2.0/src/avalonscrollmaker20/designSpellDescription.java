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
import buoy.widget.BTextField;
import buoy.widget.ColumnContainer;
import buoy.widget.LayoutInfo;

/**
 * @desc   
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class designSpellDescription extends ColumnContainer
{
  public BTextField spellCode;
  public BTextField spellTitle;
  public BTextField spellSchool;
  public BButton spellAction;
  public static final int WIDTH = 25;

  public designSpellDescription( boolean editable )
  {
    super();
    this.setDefaultLayout( new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.VERTICAL ) );

    spellCode = new BTextField();
    spellTitle = new BTextField();
    spellSchool = new BTextField();
    spellAction = new BButton();

    if ( !editable )
    {
      spellCode.setEditable( false );
      spellTitle.setEditable( false );
      spellSchool.setEditable( false );

      spellAction.setText( "Remove Spell" );
      spellAction.setFocusable( false );
      spellAction.setActionCommand( "removeSpell" );
    }
    else // editable = true
    {
      spellAction.setText( "Add Spell" );
      spellAction.setActionCommand( "addSpell" );
    }

    this.add( spellCode );
    this.add( spellTitle );
    this.add( spellSchool );
    this.add( spellAction );
  }

}
