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
import buoy.widget.RowContainer;

/**
 * @desc   Object for displaying label/input fields for a School in a SimpleTab
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class SimpleSchoolRow extends RowContainer
{
  public BLabel schoolLabel;
  public BTextField spellInput;
  public BTextField breathInput;
  private static final int WIDTH = 3;

  public SimpleSchoolRow( String schoolName )
  {
    super();
    setDefaultLayout( new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL ) );

    schoolLabel = new BLabel( schoolName );
    spellInput = new BTextField( WIDTH );
    breathInput = new BTextField( WIDTH );

    this.add( schoolLabel );
    this.add( spellInput );
    this.add( breathInput );
  }

}
