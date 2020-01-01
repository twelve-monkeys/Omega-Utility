package com.jumbodinosaurs.omegautility.gui.radialmenu.buttons.mainmenu;

import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.RadialMenuUtil;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.RadialButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.mainmenu.DefaultRetentionButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.util.LabelCon;
import com.jumbodinosaurs.omegautility.gui.OmegaResourceUtil;

public class RetentionButton extends DefaultRetentionButton
{
    @Override
    public RadialButton getRadialButton()
    {
        LabelCon defaultRetentionLabelCon = new LabelCon(category, OmegaResourceUtil.retentionIcon, getDefaultAction());
        return RadialMenuUtil.getRadialButton(defaultRetentionLabelCon);
    }
    
    @Override
    public int getDefaultPriority()
    {
        return Integer.MAX_VALUE;
    }
}
