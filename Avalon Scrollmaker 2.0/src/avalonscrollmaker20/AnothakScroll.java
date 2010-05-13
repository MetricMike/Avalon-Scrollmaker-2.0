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

import com.itextpdf.text.Image;
import java.util.ArrayList;

/**
 * @desc Provides a representation for an Anothic Scroll and its components.
 * @author Michael Weigle <michael.weigle@gmail.com
 */
public class AnothakScroll
{
  public enum Element
  {
    EARTH( "Earth" ), AIR( "Air" ), FIRE( "Fire" ), WATER( "Water" ), NEXUS( "Nexus" ), VOID( "Void" ),
    FLESH( "Flesh" ), UNDEFINED( "" );
    private String realElement;

    private Element( String realElement )
    {
      this.realElement = realElement;
    }

    @Override
    public String toString()
    {
      return realElement;
    }

    public static Element getValue( String value )
    {
      try
      {
        return valueOf( value.toUpperCase() );
      }
      catch ( Exception e )
      {
        return UNDEFINED;
      }
    }

  }

  public enum Circle
  {
    FIRST( "First" ), SECOND( "Second" ), THIRD( "Third" ), FOURTH( "Fourth" ), FIFTH( "Fifth" ),
    SIXTH( "Sixth" ), SEVENTH( "Seventh" ), PURE_FIRST( "First Pure" ), PURE_SECOND( "Second Pure" ),
    PURE_THIRD( "Third Pure" ), PURE_FOURTH( "Fourth Pure" ), PURE_FIFTH( "Fifth Pure" ),
    PURE_SIXTH( "Sixth Pure" ), PURE_SEVENTH( "Seventh Pure" ), UNDEFINED( "" );
    private String realCircle;

    private Circle( String realCircle )
    {
      this.realCircle = realCircle;
    }

    @Override
    public String toString()
    {
      return realCircle;
    }

    public static Circle getValue( String value )
    {
      try
      {
        return valueOf( value.toUpperCase() );
      }
      catch ( Exception e )
      {
        return UNDEFINED;
      }
    }

  }

  public enum OldSchool
  {
    ENTHE( "Enthe" ), HEITTUR( "Heittur" ), EINSET( "Einset" ), XIKIIL( "Xikiil" ), TAJEAR( "Tajear" ),
    OGININ( "Oginin" ), ZANSIN( "Zansin" ), UNDEFINED( "" );
    private String realOldSchool;

    private OldSchool( String realOldSchool )
    {
      this.realOldSchool = realOldSchool;
    }

    @Override
    public String toString()
    {
      return realOldSchool;
    }

    public static OldSchool getValue( String value )
    {
      try
      {
        return valueOf( value.toUpperCase() );
      }
      catch ( Exception e )
      {
        return UNDEFINED;
      }
    }

  }

  public enum NewSchool
  {
    THEKSO( "Thekso" ), HETTER( "Hetter" ), CHATTEN( "Chatten" ), XIETEP( "Xietep" ), TASOL( "Tasol" ),
    OJIIN( "Ojiin" ), ZUN( "Zun" ), UNDEFINED( "" );
    private String realNewSchool;

    private NewSchool( String realNewSchool )
    {
      this.realNewSchool = realNewSchool;
    }

    @Override
    public String toString()
    {
      return realNewSchool;
    }

    public static NewSchool getValue( String value )
    {
      try
      {
        return valueOf( value.toUpperCase() );
      }
      catch ( Exception e )
      {
        return UNDEFINED;
      }
    }

  }

  public enum Keu
  {
    EDEN( "eden" ), HIECIN( "Hiecin" ), SEYLIN( "seylin" ), KEUNA( "keuna" ), BIRSIN( "BirSin" ),
    NORT( "Nort" ), BUUSIN( "Buusin" ), UNDEFINED( "" );
    private String realKeu;

    private Keu( String realKeu )
    {
      this.realKeu = realKeu;
    }

    @Override
    public String toString()
    {
      return realKeu;
    }

    public static Keu getValue( String value )
    {
      try
      {
        return valueOf( value.toUpperCase() );
      }
      catch ( Exception e )
      {
        return UNDEFINED;
      }
    }

  }

  public enum Word
  {
    ANOTHO( "Anotho" ), BURR( "Burr" ), CHATTEN( "Chatten" ), CIN( "Cin" ), EKS( "Eks" ), ERSH( "Ersh" ),
    FETT( "Fett" ), FINN( "Finn" ), GOJIN( "Gojin" ), HEARCE( "Hearce" ), HEPHT( "Hepht" ),
    HETTER( "Hetter" ), LILIN( "Lilin" ), LURR( "Lurr" ), MIRN( "Mirn" ), MOL( "Mol" ), NETT( "Nett" ),
    O( "O" ), OJIIN( "Ojiin" ), ONK( "Onk" ), PRAMA( "Prama" ), RISH( "Rish" ), SETT( "Sett" ),
    SEYANRYN( "Seyanryn" ), SEYTE( "Seyte" ), SIFF( "Siff" ), SORN( "Sorn" ), TASOL( "Tasol" ),
    TEMME( "Temme" ), THEIT( "Theit" ), THEKSO( "Thekso" ), TRITE( "Trite" ), URDT( "Urdt" ),
    XIETEP( "Xietep" ), ZEWE( "Zewe" ), ZUN( "Zun" ), GESTURE( "(Gesture)" ), EFFECT( "(Effect)" ),
    UNDEFINED( "       " );
    private String realWord;

    private Word( String realWord )
    {
      this.realWord = realWord;
    }

    @Override
    public String toString()
    {
      return realWord;
    }

    public static Word getValue( String value )
    {
      try
      {
        return valueOf( value.toUpperCase() );
      }
      catch ( Exception e )
      {
        return UNDEFINED;
      }
    }

  }

  public enum Symbol
  {
    ANOTHO( "" ), BURR( "0" ), CHATTEN( "1" ), CIN( "2" ), EKS( "3" ), ERSH( "4" ),
    FETT( "5" ), FINN( "6" ), GOJIN( "7" ), HEARCE( "8" ), HEPHT( "9" ),
    HETTER( "a" ), LILIN( "b" ), LURR( "c" ), MIRN( "d" ), MOL( "e" ), NETT( "f" ),
    O( "g" ), OJIIN( "h" ), ONK( "i" ), PRAMA( "j" ), RISH( "k" ), SETT( "l" ),
    SEYANRYN( "" ), SEYTE( "m" ), SIFF( "n" ), SORN( "o" ), TASOL( "p" ),
    TEMME( "q" ), THEIT( "r" ), THEKSO( "s" ), TRITE( "t" ), URDT( "u" ),
    XIETEP( "v" ), ZEWE( "w" ), ZUN( "x" ), GESTURE( "y" ), EFFECT( "z" ),
    UNDEFINED( "" );
    private String realSymbol;

    private Symbol( String realSymbol )
    {
      this.realSymbol = realSymbol;
    }

    @Override
    public String toString()
    {
      return realSymbol;
    }

    public static Symbol getValue( String value )
    {
      try
      {
        return valueOf( value.toUpperCase() );
      }
      catch ( Exception e )
      {
        return UNDEFINED;
      }
    }

  }

  public ArrayList<Symbol> liersethPhrase_Symbol;
  public ArrayList<Word> liersethPhrase_Common;
  public String spellTitle;
  public String spellCode;
  public Keu sourceKeu;
  public Keu destinationKeu;
  public Circle spellCircle;
  public Element spellElement;
  public OldSchool spellOldSchool;
  public NewSchool spellNewSchool;
  public Image backgroundImageFull;
  private int elementChar = 0;
  private int schoolChar = 1;

  public AnothakScroll()
  {
    this( "", "", "" );
  }

  public AnothakScroll( String fakeTag, NewSchool tagSchool )
  {
    this( fakeTag, "", tagSchool.toString() );
  }

  public AnothakScroll( String tagNumber, String tagTitle, String tagSchool )
  {
    liersethPhrase_Symbol = new ArrayList<Symbol>();
    liersethPhrase_Common = new ArrayList<Word>();
    spellTitle = tagTitle;
    spellCode = tagNumber.toLowerCase();

    // The "Gesture" will always begin a Lierseth Phrase
    liersethPhrase_Common.add( Word.GESTURE );
    liersethPhrase_Symbol.add( Symbol.GESTURE );

    // Assign [Old/New]School, partial Phrases, and involved Keus
    switch ( NewSchool.getValue( tagSchool ) )
    {
      case THEKSO:
        spellOldSchool = OldSchool.ENTHE;
        spellNewSchool = NewSchool.THEKSO;
        sourceKeu = Keu.EDEN;
        liersethPhrase_Common.add( Word.TEMME );
        liersethPhrase_Common.add( Word.THEKSO );
        liersethPhrase_Common.add( Word.EKS );
        liersethPhrase_Common.add( Word.SETT );
        liersethPhrase_Symbol.add( Symbol.TEMME );
        liersethPhrase_Symbol.add( Symbol.THEKSO );
        liersethPhrase_Symbol.add( Symbol.EKS );
        liersethPhrase_Symbol.add( Symbol.SETT );
        break;
      case HETTER:
        spellOldSchool = OldSchool.HEITTUR;
        spellNewSchool = NewSchool.HETTER;
        sourceKeu = Keu.HIECIN;
        liersethPhrase_Common.add( Word.HEPHT );
        liersethPhrase_Common.add( Word.HETTER );
        liersethPhrase_Common.add( Word.TRITE );
        liersethPhrase_Common.add( Word.SETT );
        liersethPhrase_Symbol.add( Symbol.HEPHT );
        liersethPhrase_Symbol.add( Symbol.HETTER );
        liersethPhrase_Symbol.add( Symbol.TRITE );
        liersethPhrase_Symbol.add( Symbol.SETT );
        break;
      case CHATTEN:
        spellOldSchool = OldSchool.EINSET;
        spellNewSchool = NewSchool.CHATTEN;
        sourceKeu = Keu.SEYLIN;
        liersethPhrase_Common.add( Word.FINN );
        liersethPhrase_Common.add( Word.CHATTEN );
        liersethPhrase_Common.add( Word.SIFF );
        liersethPhrase_Common.add( Word.SETT );
        liersethPhrase_Symbol.add( Symbol.FINN );
        liersethPhrase_Symbol.add( Symbol.CHATTEN );
        liersethPhrase_Symbol.add( Symbol.SIFF );
        liersethPhrase_Symbol.add( Symbol.SETT );
        break;
      case XIETEP:
        spellOldSchool = OldSchool.XIKIIL;
        spellNewSchool = NewSchool.XIETEP;
        sourceKeu = Keu.KEUNA;
        liersethPhrase_Common.add( Word.ONK );
        liersethPhrase_Common.add( Word.XIETEP );
        liersethPhrase_Common.add( Word.CIN );
        liersethPhrase_Common.add( Word.SETT );
        liersethPhrase_Symbol.add( Symbol.ONK );
        liersethPhrase_Symbol.add( Symbol.XIETEP );
        liersethPhrase_Symbol.add( Symbol.CIN );
        liersethPhrase_Symbol.add( Symbol.SETT );
        break;
      case TASOL:
        spellOldSchool = OldSchool.TAJEAR;
        spellNewSchool = NewSchool.TASOL;
        sourceKeu = Keu.BIRSIN;
        liersethPhrase_Common.add( Word.LURR );
        liersethPhrase_Common.add( Word.TASOL );
        liersethPhrase_Common.add( Word.RISH );
        liersethPhrase_Common.add( Word.SETT );
        liersethPhrase_Symbol.add( Symbol.LURR );
        liersethPhrase_Symbol.add( Symbol.TASOL );
        liersethPhrase_Symbol.add( Symbol.RISH );
        liersethPhrase_Symbol.add( Symbol.SETT );
        break;
      case OJIIN:
        spellOldSchool = OldSchool.OGININ;
        spellNewSchool = NewSchool.OJIIN;
        sourceKeu = Keu.NORT;
        liersethPhrase_Common.add( Word.SORN );
        liersethPhrase_Common.add( Word.OJIIN );
        liersethPhrase_Common.add( Word.NETT );
        liersethPhrase_Common.add( Word.SETT );
        liersethPhrase_Symbol.add( Symbol.SORN );
        liersethPhrase_Symbol.add( Symbol.OJIIN );
        liersethPhrase_Symbol.add( Symbol.NETT );
        liersethPhrase_Symbol.add( Symbol.SETT );
        break;
      case ZUN:
        spellOldSchool = OldSchool.ZANSIN;
        spellNewSchool = NewSchool.ZUN;
        sourceKeu = Keu.BUUSIN;
        liersethPhrase_Common.add( Word.ZUN );
        liersethPhrase_Symbol.add( Symbol.ZUN );
        break;
      default: // UNDEFINED
        spellOldSchool = OldSchool.UNDEFINED;
        spellNewSchool = NewSchool.UNDEFINED;
        sourceKeu = Keu.UNDEFINED;
        liersethPhrase_Common.add( Word.UNDEFINED );
        liersethPhrase_Common.add( Word.UNDEFINED );
        liersethPhrase_Common.add( Word.UNDEFINED );
        liersethPhrase_Symbol.add( Symbol.UNDEFINED );
        liersethPhrase_Symbol.add( Symbol.UNDEFINED );
        liersethPhrase_Symbol.add( Symbol.UNDEFINED );
        break;
    }

    // The "Effect" will always end a Lierseth Phrase
    liersethPhrase_Common.add( Word.EFFECT );
    liersethPhrase_Symbol.add( Symbol.EFFECT );

    // Check if spell is Pure
    if ( spellCode.charAt( 0 ) == 'p' )
    {
      this.elementChar = 1;
      this.schoolChar = 2;
    }

    // Inspect elementChar of spellCode, assign spellElement, elemental Word/Symbol, and
    // backgroundImage
    switch ( spellCode.charAt( elementChar ) )
    {
      case 'e' | 'E':
        spellElement = Element.EARTH;
        destinationKeu = Keu.KEUNA;
        liersethPhrase_Common.add( 2, Word.URDT );
        liersethPhrase_Symbol.add( 2, Symbol.URDT );
        break;
      case 'a' | 'A':
        spellElement = Element.AIR;
        destinationKeu = Keu.SEYLIN;
        liersethPhrase_Common.add( 2, Word.FETT );
        liersethPhrase_Symbol.add( 2, Symbol.FETT );
        break;
      case 'f' | 'F':
        spellElement = Element.FIRE;
        destinationKeu = Keu.BUUSIN;
        liersethPhrase_Common.add( 2, Word.MOL );
        liersethPhrase_Symbol.add( 2, Symbol.MOL );
        break;
      case 'w' | 'W':
        spellElement = Element.WATER;
        destinationKeu = Keu.HIECIN;
        liersethPhrase_Common.add( 2, Word.MIRN );
        liersethPhrase_Symbol.add( 2, Symbol.MIRN );
        break;
      case 'n' | 'N':
        spellElement = Element.NEXUS;
        destinationKeu = Keu.BIRSIN;
        liersethPhrase_Common.add( 2, Word.ZEWE );
        liersethPhrase_Symbol.add( 2, Symbol.ZEWE );
        break;
      case 'v' | 'V':
        spellElement = Element.VOID;
        destinationKeu = Keu.EDEN;
        liersethPhrase_Common.add( 2, Word.THEIT );
        liersethPhrase_Symbol.add( 2, Symbol.THEIT );
        break;
      default: // UNDEFINED
        spellElement = Element.UNDEFINED;
        destinationKeu = Keu.UNDEFINED;
        liersethPhrase_Common.add( 2, Word.UNDEFINED );
        liersethPhrase_Symbol.add( 2, Symbol.UNDEFINED );
        break;
    }

    // Inspect schoolChar of spellCode, assign spellCircle
    switch ( spellCode.charAt( schoolChar ) )
    {
      case '1':
        if ( schoolChar == 1 )
          spellCircle = Circle.FIRST;
        else // schoolChar == 2
          spellCircle = Circle.PURE_FIRST;
        break;
      case '2':
        if ( schoolChar == 1 )
          spellCircle = Circle.SECOND;
        else // schoolChar == 2
          spellCircle = Circle.PURE_SECOND;
        break;
      case '3':
        if ( schoolChar == 1 )
          spellCircle = Circle.THIRD;
        else // schoolChar == 2
          spellCircle = Circle.PURE_THIRD;
        break;
      case '4':
        if ( schoolChar == 1 )
          spellCircle = Circle.FOURTH;
        else // schoolChar == 2
          spellCircle = Circle.PURE_FIRST;
        break;
      case '5':
        if ( schoolChar == 1 )
          spellCircle = Circle.FIFTH;
        else // schoolChar == 2
          spellCircle = Circle.PURE_FIFTH;
        break;
      case '6':
        if ( schoolChar == 1 )
          spellCircle = Circle.SIXTH;
        else // schoolChar == 2
          spellCircle = Circle.PURE_SIXTH;
        break;
      case '7': // Insert extra words for Breath Spell
        if ( schoolChar == 1 )
          spellCircle = Circle.SEVENTH;
        else // schoolChar == 2
          spellCircle = Circle.PURE_SEVENTH;

        liersethPhrase_Common.add( 1, Word.O );
        liersethPhrase_Common.add( 2, Word.LILIN );
        liersethPhrase_Common.add( 3, Word.ANOTHO );
        liersethPhrase_Common.add( 4, Word.SEYANRYN );
        liersethPhrase_Common.add( 5, Word.UNDEFINED );
        liersethPhrase_Symbol.add( 1, Symbol.O );
        liersethPhrase_Symbol.add( 2, Symbol.LILIN );
        liersethPhrase_Symbol.add( 3, Symbol.ANOTHO );
        liersethPhrase_Symbol.add( 4, Symbol.SEYANRYN );
        liersethPhrase_Symbol.add( 5, Symbol.UNDEFINED );
        break;
      default: // UNDEFINED
        spellCircle = Circle.UNDEFINED;
        break;
    }

    // Assign backgroundImages
    if ( sourceKeu == sourceKeu.UNDEFINED | destinationKeu == destinationKeu.UNDEFINED )
    {
      backgroundImageFull = null;
      System.err.println( "Keus not found!" + "\nSourceKeu = " + sourceKeu.toString().toLowerCase()
                          + "\nDestinationKeu = " + destinationKeu.toString().toLowerCase() );
    }
    else
    {
      try
      {
        String resourceLocation = "resources/" + sourceKeu.toString().toLowerCase()
                                  + destinationKeu.toString().toLowerCase();

        String imageFullURL = this.getClass().getResource( resourceLocation
                                                           + ".png" ).toString().toLowerCase();

        backgroundImageFull = Image.getInstance( imageFullURL );
        backgroundImageFull.setAlignment( Image.MIDDLE | Image.UNDERLYING );
        backgroundImageFull.scaleAbsolute( 594, 378 );
      }
      catch ( Exception ex )
      {
        System.err.println( ex + "\nImages for " + sourceKeu.toString()
                            + destinationKeu.toString() + " were not found." );

      }
    }
  }

  public boolean isPure()
  {
    if( elementChar == 0 )
      return false;

    return true;
  }
}
