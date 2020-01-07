package com.jumbodinosaurs.omegautility.gui.radialmenu.buttons.mainmenu;

import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.RadialMenuUtil;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.RadialButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.mainmenu.DefaultOptionsButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.util.LabelCon;
import com.jumbodinosaurs.omegautility.gui.OmegaResourceUtil;

public class OptionsButton extends DefaultOptionsButton
{
    @Override
    public RadialButton getRadialButton()
    {
        LabelCon defaultRetentionLabelCon = new LabelCon(category, OmegaResourceUtil.optionsIcon,
                                                         getDefaultAction());
        return RadialMenuUtil.getRadialButton(defaultRetentionLabelCon);
    }
    
    @Override
    public int getDefaultPriority()
    {
        return Integer.MIN_VALUE + 1;
    }
}
