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

import avalonscrollmaker20.AnothakScroll.Element;
import avalonscrollmaker20.AnothakScroll.NewSchool;
import buoy.widget.ColumnContainer;
import buoy.widget.LayoutInfo;
import java.util.ArrayList;

/**
 * @desc   Object for displaying an Element Tab inside Simple Design
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class SimpleTab extends ColumnContainer
{
  private SimpleSchoolRow labelRow;
  public SimpleSchoolRow theksoRow;
  public SimpleSchoolRow hetterRow;
  public SimpleSchoolRow chattenRow;
  public SimpleSchoolRow xietepRow;
  public SimpleSchoolRow tasolRow;
  public SimpleSchoolRow ojiinRow;
  public SimpleSchoolRow zunRow;

  public SimpleTab()
  {
    super();

    this.setDefaultLayout( new LayoutInfo( LayoutInfo.CENTER, LayoutInfo.HORIZONTAL ) );

    labelRow = new SimpleSchoolRow( 0 );
    theksoRow = new SimpleSchoolRow( "Thekso" );
    hetterRow = new SimpleSchoolRow( "Hetter" );
    chattenRow = new SimpleSchoolRow( "Chatten" );
    xietepRow = new SimpleSchoolRow( "Xietep" );
    tasolRow = new SimpleSchoolRow( "Tasol" );
    ojiinRow = new SimpleSchoolRow( "Ojiin" );
    zunRow = new SimpleSchoolRow( "Zun" );

    this.add( labelRow );
    this.add( theksoRow );
    this.add( hetterRow );
    this.add( chattenRow );
    this.add( xietepRow );
    this.add( tasolRow );
    this.add( ojiinRow );
    this.add( zunRow );
  }

  public void reset()
  {
    theksoRow.reset();
    hetterRow.reset();
    chattenRow.reset();
    xietepRow.reset();
    tasolRow.reset();
    ojiinRow.reset();
    zunRow.reset();
  }

  public int calculate()
  {
    int numSpells = 0;

    numSpells += theksoRow.calculate();
    numSpells += hetterRow.calculate();
    numSpells += chattenRow.calculate();
    numSpells += xietepRow.calculate();
    numSpells += tasolRow.calculate();
    numSpells += ojiinRow.calculate();
    numSpells += zunRow.calculate();

    return numSpells;
  }

  public void buildSimpleList( ArrayList<AnothakScroll> whichList, Element whichElement )
  {
    theksoRow.buildSimpleList( whichList, whichElement, NewSchool.THEKSO );
    hetterRow.buildSimpleList( whichList, whichElement, NewSchool.HETTER );
    chattenRow.buildSimpleList( whichList, whichElement, NewSchool.CHATTEN );
    xietepRow.buildSimpleList( whichList, whichElement, NewSchool.XIETEP );
    tasolRow.buildSimpleList( whichList, whichElement, NewSchool.TASOL );
    ojiinRow.buildSimpleList( whichList, whichElement, NewSchool.OJIIN );
    zunRow.buildSimpleList( whichList, whichElement, NewSchool.ZUN );
  }

}
