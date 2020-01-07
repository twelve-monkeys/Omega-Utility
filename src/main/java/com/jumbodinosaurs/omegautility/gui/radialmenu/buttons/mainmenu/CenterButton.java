package com.jumbodinosaurs.omegautility.gui.radialmenu.buttons.mainmenu;

import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.MainMenuManager;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.RadialMenuUtil;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.RadialButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.mainmenu.RadialMainMenuButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.util.LabelCon;
import com.jumbodinosaurs.omegautility.gui.OmegaResourceUtil;

public class CenterButton extends RadialMainMenuButton
{
    @Override
    public RadialButton getRadialButton()
    {
        LabelCon defaultLabelCon = new LabelCon(MainMenuManager.getCenterButtonCategory(), OmegaResourceUtil.omegaIcon, RadialMenuUtil.getEmptyAction());
        return RadialMenuUtil.getCenterButton(defaultLabelCon);
    }
    
    @Override
    public int getDefaultPriority()
    {
        return Integer.MIN_VALUE + 1;
    }
}
