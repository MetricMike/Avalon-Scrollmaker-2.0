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

import buoy.widget.*;

/**
 * @desc   Displays the GUI
 * @author Michael Weigle <michael.weigle@gmail.com>
 */
public class ScrollMaker extends BFrame
{
  // MenuBar
    // Actions Menu
      // Print Item
      // Undo Item
      // Reset Item
      // Exit Item
    // Help Menu
      // Use DB Item
      // About Item
      // Support Item
    // Simple Switch
    // Design Switch

  // Simple Container
    // Earth Tab
    // Air Tab
    // Fire Tab
    // Water Tab
    // Nexus Tab
    // Void Tab

  // Design Container
    // Add Spell
      // Current Spell Description
      // Add Spell Button
    // Remove Spell
      // Last Spell Description
      // Remove Spell Button

  // Dashboard Container
    // Total Spells Number
    // Total Pages Number

  public ScrollMaker()
  {
    super( "Avalon Scrollmaker 2.0" );

    // Make stuff!

    pack();
    setVisible( true );
  }

}
