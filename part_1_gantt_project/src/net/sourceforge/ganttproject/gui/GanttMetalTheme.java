
package net.sourceforge.ganttproject.gui;

//import java.awt.Font;

import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

/**
 * Custom Metal theme for GanttProject.
 */
public class GanttMetalTheme extends DefaultMetalTheme
{
/** Font to be used for all components*/
  private final FontUIResource font;
  /**
   * Constructs a GanttMetalTheme based on the provided UI configuration.
   *
   * @param config The UI configuration specifying the font to be used.
   */
  public GanttMetalTheme(UIConfiguration config)
  {
    super();
      font = new FontUIResource(config.getMenuFont());
  }

  public FontUIResource getControlTextFont()
	{
	  return font;
	}

  public FontUIResource getMenuTextFont()
  {
    return font;
  }

  public FontUIResource getSystemTextFont()
  {
    return font;
  }

  public FontUIResource getUserTextFont()
  {
    return font;
  }

  public FontUIResource getWindowTitleFont()
  {
    return font;
  }
}

