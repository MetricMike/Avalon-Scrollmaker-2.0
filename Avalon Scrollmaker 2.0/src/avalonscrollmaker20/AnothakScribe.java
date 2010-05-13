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

import avalonscrollmaker20.AnothakScroll.Circle;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.ElementTags;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.MultiColumnText;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @desc   Contains the code to create a PDF from AnothakScrolls.
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class AnothakScribe
{
  private Font f_phraseCommon;
  private Font f_phraseCommonBreath;
  private Font f_phraseSymbol;
  private Font f_phraseSymbolBreath;
  private Font f_school;
  private Font f_schoolPure;
  private Font f_code;
  private Font f_title;
  //private Font f_titlePhrase; for small title above each simplePhrase
  private Font f_keu;

  private Document doc_scrolls;
  private String doc_name = new String( "Anothak Scrolls " + new Random().nextInt(99) + ".pdf" );
  private PdfWriter doc_writer;

  public AnothakScribe()
  {
    makeFonts();
    initializeDoc();
  }

  private void makeFonts()
  {
    try
    {
      String fontURL = this.getClass().getResource( "resources/Avalon - Lierseth.ttf" ).toString();
      BaseFont bf = BaseFont.createFont( fontURL, "", BaseFont.EMBEDDED );
      f_phraseSymbol = new Font( bf, 70 );
      f_phraseSymbolBreath = new Font( bf, 55 );

      fontURL = this.getClass().getResource( "resources/HARNGTON.TTF" ).toString();
      bf = BaseFont.createFont( fontURL, "", BaseFont.EMBEDDED );
      f_phraseCommon = new Font( bf, 25 );
      f_phraseCommonBreath = new Font ( bf, 15 );

      fontURL = this.getClass().getResource( "resources/ENDOR___.ttf" ).toString();
      bf = BaseFont.createFont( fontURL, "", BaseFont.EMBEDDED );
      f_school = new Font( bf, 30 );
      f_schoolPure = new Font( bf, 25 );

      fontURL = this.getClass().getResource( "resources/neverworld.ttf" ).toString();
      bf = BaseFont.createFont( fontURL, "", BaseFont.EMBEDDED );
      f_title = new Font( bf, 40 );
      //f_titlePhrase = new Font( bf, 10 );
      f_code = new Font( bf, 50 );
      f_code.setColor( new BaseColor( 128, 128, 128, 16 ) );

      fontURL = this.getClass().getResource( "resources/evanescent.ttf" ).toString();
      bf = BaseFont.createFont( fontURL, "", BaseFont.EMBEDDED );
      f_keu = new Font( bf, 40 );
    }
    catch ( Exception ex )
    {
      System.err.println( ex + "\nProgram closing." );
      System.exit( 2 );
    }
  }

  private void initializeDoc()
  {
    // Create a Document
    doc_scrolls = new Document( PageSize.LETTER, 18f, 18f, 18f, 18f );

    // Get a DocWriter instance
    try
    {
        doc_writer = PdfWriter.getInstance( doc_scrolls, new FileOutputStream(
                doc_name ) );
        doc_writer.setPdfVersion( PdfWriter.VERSION_1_6 );
    }
    catch ( Exception ex )
    {
        System.err.println( ex + "\nProgram closing." );
        System.exit( 3 );
    }

    // Open the Document
    doc_scrolls.addTitle( doc_name.substring( 0, doc_name.length() - 3 ) );
    doc_scrolls.addSubject( "A collection of Avalon-legal Anothak Scrolls" );
    doc_scrolls.addAuthor( "Michael Weigle" );
    doc_scrolls.addCreator( "Avalon Scrollmaker 2.0, powered by iText" );
    doc_scrolls.open();
  }

  public void writeToDoc( ArrayList<AnothakScroll> spellList, boolean simpleMode )
  {
    // Format content for inserting into a PDF
    for ( int i = 0; i < spellList.size(); i++ )
    {
      Paragraph spellCode = new Paragraph( spellList.get( i ).spellCode, f_code );
      spellCode.setAlignment( ElementTags.ALIGN_RIGHT );
      spellCode.setMultipliedLeading( 0.5f );
      spellCode.setIndentationRight( 15f );

      Paragraph spellTitle = new Paragraph( spellList.get( i ).spellTitle + "\n", f_title );
      spellTitle.setAlignment( ElementTags.ALIGN_CENTER );
      spellTitle.setMultipliedLeading( 0.5f );
      spellTitle.setSpacingAfter( 36f );

      Paragraph spellCircleSchool;
      if( spellList.get( i ).isPure() )
        spellCircleSchool = new Paragraph( spellList.get( i ).spellCircle.toString()
                                                   + " Circle\n    of " + spellList.get( i ).spellOldSchool.toString(), f_schoolPure );
      else // !spellList.get( i ).isPure()
        spellCircleSchool = new Paragraph( spellList.get( i ).spellCircle.toString()
                                                   + " Circle\n    of " + spellList.get( i ).spellOldSchool.toString(), f_school );
      spellCircleSchool.setAlignment( ElementTags.ALIGN_LEFT );
      spellCircleSchool.setIndentationLeft( 18f );
      spellCircleSchool.setMultipliedLeading( 1.75f );

      Paragraph sourceKeu = new Paragraph( spellList.get( i ).sourceKeu.toString() + "|~", f_keu );
      sourceKeu.setAlignment( ElementTags.ALIGN_RIGHT );
      sourceKeu.setIndentationRight( 36f );
      sourceKeu.setMultipliedLeading( 1f );

      Paragraph directionKeu = new Paragraph( "§", f_keu );
      directionKeu.setAlignment( ElementTags.ALIGN_RIGHT );
      directionKeu.setIndentationRight( 90f );
      directionKeu.setMultipliedLeading( 0.875f );

      Paragraph destinationKeu = new Paragraph( spellList.get( i ).destinationKeu.toString() + "|~", f_keu );
      destinationKeu.setAlignment( ElementTags.ALIGN_RIGHT );
      destinationKeu.setIndentationRight( 36f );
      destinationKeu.setMultipliedLeading( 0.625f );

      Paragraph phraseCommon;
      Paragraph phraseSymbol;

      if ( spellList.get( i ).spellCircle != Circle.SEVENTH && spellList.get( i ).spellCircle != Circle.PURE_SEVENTH )
      {
        phraseCommon = new Paragraph( "", f_phraseCommon );
        phraseCommon.setSpacingAfter( 27f );
        phraseSymbol = new Paragraph( "", f_phraseSymbol );
        if ( (i % 2) <= 0 )
          phraseSymbol.setSpacingAfter( 90f );
        else // ( (i % 2) > 0 )
          phraseSymbol.setSpacingAfter( 0f );
      }
      else
      {
        phraseCommon = new Paragraph( "", f_phraseCommonBreath );
        phraseCommon.setSpacingAfter( 36f );
        phraseSymbol = new Paragraph( "", f_phraseSymbolBreath );
        if ( (i % 2) <= 0 )
          phraseSymbol.setSpacingAfter( 103.5f );
        else // ( (i % 2) > 0 )
          phraseSymbol.setSpacingAfter( 0f );
      }

      phraseCommon.setAlignment( ElementTags.ALIGN_CENTER );
      phraseCommon.setMultipliedLeading( 1.5f );
      for ( AnothakScroll.Word w : spellList.get( i ).liersethPhrase_Common )
        phraseCommon.add( w.toString() + " " );

      if ( simpleMode )
      {
        phraseSymbol.setAlignment( ElementTags.ALIGN_CENTER );
        phraseSymbol.setSpacingBefore( 36f );
        phraseSymbol.setSpacingAfter( 0f );
        phraseSymbol.setMultipliedLeading( 0.75f );
      }
      else // not simpleMode
      {
        phraseSymbol.setAlignment( ElementTags.ALIGN_CENTER );
        phraseSymbol.setMultipliedLeading( 0.5f );
      }

      for ( AnothakScroll.Symbol s : spellList.get( i ).liersethPhrase_Symbol )
      {
        phraseSymbol.add( s.toString() );
      }

      // Add content to the document
      try
      {
        if ( simpleMode )
          doc_scrolls.add( phraseSymbol );
        else
        {
          Image tmpImage = null;
          tmpImage = spellList.get( i ).backgroundImageFull;

          if ( tmpImage != null )
          {
            if ( (i % 2) <= 0 )
              tmpImage.setAbsolutePosition( 9f, 405f );
            else // (i % 2) >= 0
              tmpImage.setAbsolutePosition( 9f, 9f );

            doc_scrolls.add( tmpImage );
          }

          //doc_scrolls.add( Chunk.NEWLINE );
          doc_scrolls.add( spellCode );
          doc_scrolls.add( spellTitle );

          // Crap, I hate formatting
          MultiColumnText mct = new MultiColumnText( 108f );
          mct.addRegularColumns( doc_scrolls.left(), doc_scrolls.right(), 54f, 2 );
          mct.addElement( spellCircleSchool );
          mct.addElement( sourceKeu );
          mct.addElement( directionKeu );
          mct.addElement( destinationKeu );

          doc_scrolls.add( mct );

          doc_scrolls.add( new Chunk( "\n", new Font( Font.FontFamily.COURIER, 18f, Font.NORMAL ) ) );

          doc_scrolls.add( phraseCommon );
          doc_scrolls.add( phraseSymbol );

          if ( (i % 2) > 0 )
            doc_scrolls.newPage();
        }

      }
      catch ( Exception ex )
      {
        System.err.println( ex + "\nProgram closing." );
        System.exit( 4 );
      }
    }

    // Close the Document
    doc_scrolls.close();

    JOptionPane.showMessageDialog( null, doc_name + " was printed successfully!",
                                   "Print Status", JOptionPane.INFORMATION_MESSAGE );
  }

}
