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

import buoy.widget.BLabel;
import buoy.widget.BTextField;
import buoy.widget.LayoutInfo;
import buoy.widget.GridContainer;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @desc   Object for displaying label/input fields for a School in a SimpleTab
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class SimpleSchoolRow extends GridContainer
{
  public BLabel schoolLabel;
  public BTextField spellInput;
  public BTextField breathInput;
  private static final int WIDTH = 3;
  private Insets padder = new Insets( 10, 15, 10, 15 );

  public SimpleSchoolRow( String schoolName )
  {
    super( 5, 1 );

    schoolLabel = new BLabel( schoolName );
      schoolLabel.getComponent().setHorizontalAlignment( JLabel.CENTER );
    spellInput = new BTextField( WIDTH );
      spellInput.getComponent().setHorizontalAlignment( JTextField.CENTER );
    breathInput = new BTextField( WIDTH );
      breathInput.getComponent().setHorizontalAlignment( JTextField.CENTER );

    this.add( schoolLabel, 0, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padder, null ) );
    this.add( spellInput, 1, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padder, null ) );
    this.add( breathInput, 2, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.BOTH, padder, null ) );
  }

  public SimpleSchoolRow( int anything )
  {
    super( 5, 1 );

    this.add( new BLabel( "School" ), 0, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.NONE, padder, null ) );
    this.add( new BLabel( "Spells" ), 1, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.NONE, padder, null ) );
    this.add( new BLabel( "Breaths" ), 2, 0, new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.NONE, padder, null ) );
  }

}
