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
import buoy.widget.BTextField;
import buoy.widget.GridContainer;
import buoy.widget.LayoutInfo;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @desc   Object containing GUI elements to remove/add spells in Designer mode
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class DesignerPane extends GridContainer
{
  public BTextField spellCodeEdit;
  public BTextField spellCodeRead;
  public BTextField spellTitleEdit;
  public BTextField spellTitleRead;
  public BTextField spellSchoolEdit;
  public BTextField spellSchoolRead;
  public BButton spellAdd;
  public BButton spellRem;

  private Insets padWide = new Insets( 10, 15, 10, 15 );
  private Insets padNarrow = new Insets( 10, 15, 10, 15 );

  public static final int WIDTH = 15;

  public DesignerPane()
  {
    super( 3, 4 );
    this.setDefaultLayout( new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.NONE ) );

    BLabel spellCodeLabel = new BLabel( "Code" );
      spellCodeLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );
    BLabel spellTitleLabel = new BLabel( "Title" );
      spellTitleLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );
    BLabel spellSchoolLabel = new BLabel( "School" );
      spellSchoolLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );


    this.add( spellCodeLabel, 0, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
    this.add( spellTitleLabel, 0, 1, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
    this.add( spellSchoolLabel, 0, 2, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );

    spellCodeEdit = new BTextField( WIDTH );
      spellCodeEdit.getComponent().setHorizontalAlignment( JTextField.CENTER );
    spellCodeRead = new BTextField( WIDTH );
      spellCodeRead.getComponent().setHorizontalAlignment( JTextField.CENTER );
      spellCodeRead.setEditable( false );
    spellTitleEdit = new BTextField( WIDTH );
      spellTitleEdit.getComponent().setHorizontalAlignment( JTextField.CENTER );
    spellTitleRead = new BTextField( WIDTH );
      spellTitleRead.getComponent().setHorizontalAlignment( JTextField.CENTER );
      spellTitleRead.setEditable( false );
    spellSchoolEdit = new BTextField( WIDTH );
      spellSchoolEdit.getComponent().setHorizontalAlignment( JTextField.CENTER );
    spellSchoolRead = new BTextField( WIDTH );
      spellSchoolRead.getComponent().setHorizontalAlignment( JTextField.CENTER );
      spellSchoolRead.setEditable( false );

    spellAdd = new BButton( "Add Spell" );
    spellRem = new BButton( "Remove Spell" );

   this.add( spellCodeEdit, 1, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
   this.add( spellCodeRead, 2, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
   this.add( spellTitleEdit, 1, 1, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
   this.add( spellTitleRead, 2, 1, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
   this.add( spellSchoolEdit, 1, 2, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
   this.add( spellSchoolRead, 2, 2, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padNarrow, null ) );
   this.add( spellAdd, 1, 3 );
   this.add( spellRem, 2, 3 );
  }

}
