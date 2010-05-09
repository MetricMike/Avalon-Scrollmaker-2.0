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
import buoy.widget.BOutline;
import buoy.widget.BTextField;
import buoy.widget.BTextArea;
import buoy.widget.FormContainer;
import buoy.widget.LayoutInfo;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @desc   Object containing GUI elements to remove/add spells in Designer mode
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class DesignerPane extends FormContainer
{
  public BTextField spellCodeEdit;
  public BTextField spellCodeRead;
  public BTextArea spellTitleEdit;
  public BTextArea spellTitleRead;
  public BTextField spellSchoolEdit;
  public BTextField spellSchoolRead;
  public BButton spellAdd;
  public BButton spellRem;

  private Insets padWide = new Insets( 10, 15, 10, 15 );
  private Insets padNarrow = new Insets( 10, 15, 10, 15 );

  private static double[] cols = { 1, 0.0, 0.0, 0.0, 1 };
  private static double[] rows = { 1, 0.0, 0.0, 0.0, 0.0, 0.0, 1 };

  public static final int WIDTH = 10;
  public static final int ST_COL = 1;
  public static final int ST_ROW = 1;


  public DesignerPane()
  {
    super( cols, rows );

    BLabel spellCodeLabel = new BLabel( "Code" );
      spellCodeLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );
    BLabel spellTitleLabel = new BLabel( "Title" );
      spellTitleLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );
    BLabel spellSchoolLabel = new BLabel( "School" );
      spellSchoolLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );
    BLabel currentLabel = new BLabel( "Current Spell" );
      currentLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );
    BLabel lastLabel = new BLabel( "Last Spell" );
      lastLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );

    this.add( currentLabel, ST_COL+1, ST_ROW, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
    this.add( lastLabel, ST_COL+2, ST_ROW, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
    this.add( spellCodeLabel, ST_COL, ST_ROW+1, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
    this.add( spellTitleLabel, ST_COL, ST_ROW+2, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
    this.add( spellSchoolLabel, ST_COL, ST_ROW+3, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );

    spellCodeEdit = new BTextField( WIDTH );
      spellCodeEdit.getComponent().setHorizontalAlignment( JTextField.CENTER );
    spellCodeRead = new BTextField( WIDTH );
      spellCodeRead.getComponent().setHorizontalAlignment( JTextField.CENTER );
      spellCodeRead.setEditable( false );
    spellTitleEdit = new BTextArea( 2, WIDTH );
      spellTitleEdit.setWrapStyle( BTextArea.WRAP_WORD );
    spellTitleRead = new BTextArea( 2, WIDTH );
      spellTitleRead.setWrapStyle( BTextArea.WRAP_WORD );
      spellTitleRead.setEditable( false );
      spellTitleRead.setBackground( spellCodeRead.getBackground() );
    spellSchoolEdit = new BTextField( WIDTH );
      spellSchoolEdit.getComponent().setHorizontalAlignment( JTextField.CENTER );
    spellSchoolRead = new BTextField( WIDTH );
      spellSchoolRead.getComponent().setHorizontalAlignment( JTextField.CENTER );
      spellSchoolRead.setEditable( false );

    spellAdd = new BButton( "Add Spell" );
    spellRem = new BButton( "Remove Spell" );

   this.add( spellCodeEdit, ST_COL+1, ST_ROW+1, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
   this.add( spellCodeRead, ST_COL+2, ST_ROW+1, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
   this.add( new BOutline( spellTitleEdit, BorderFactory.createEtchedBorder() ), ST_COL+1, ST_ROW+2, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
   this.add( new BOutline( spellTitleRead, BorderFactory.createEtchedBorder() ), ST_COL+2, ST_ROW+2, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
   this.add( spellSchoolEdit, ST_COL+1, ST_ROW+3, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
   this.add( spellSchoolRead, ST_COL+2, ST_ROW+3, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
   this.add( spellAdd, ST_COL+1, ST_ROW+4, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
   this.add( spellRem, ST_COL+2, ST_ROW+4, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL, padNarrow, null ) );
  }

  public void reset()
  {
    spellCodeEdit.setText( "" );
    spellCodeRead.setText(  "" );
    spellTitleEdit.setText( "" );
    spellTitleRead.setText( "" );
    spellSchoolEdit.setText( "" );
    spellSchoolRead.setText( "" );
  }

}
