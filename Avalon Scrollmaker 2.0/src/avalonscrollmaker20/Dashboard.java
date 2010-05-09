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
import buoy.widget.BSeparator;
import buoy.widget.BTextField;
import buoy.widget.RowContainer;
import java.awt.Dimension;

/**
 * @desc   Contains counters for spell and page #s.
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class Dashboard extends RowContainer
{
  private BLabel spellNumLabel;
  public BTextField spellNumCounter;

  private BLabel pageNumLabel;
  public BTextField pageNumCounter;

  private static final int WIDTH = 3;

  public Dashboard()
  {
    super();

    BLabel buffer1 = new BLabel( " " );
    BLabel buffer2 = new BLabel( " " );

    spellNumLabel = new BLabel( "Total Number of Spells:" );
      spellNumLabel.setAlignment( BLabel.CENTER );
    pageNumLabel = new BLabel( "Total Number of Pages: " );
      pageNumLabel.setAlignment( BLabel.CENTER );

    spellNumCounter = new BTextField( "0", WIDTH );
      spellNumCounter.setEditable( false );
    pageNumCounter = new BTextField( "0", WIDTH );
      pageNumCounter.setEditable( false );

    this.add( buffer1 );
    this.add( spellNumLabel );
    this.add( spellNumCounter );
    this.add( buffer2 );
    this.add( pageNumLabel );
    this.add( pageNumCounter );
  }

}
