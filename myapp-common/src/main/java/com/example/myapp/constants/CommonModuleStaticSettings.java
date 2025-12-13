package com.example.myapp.constants;

import com.flowcentraltech.flowcentral.configuration.constants.AbstractFlowCentralStaticSettings;
import com.flowcentraltech.flowcentral.configuration.constants.ModuleInstallLevelConstants;
import com.tcdng.unify.common.annotation.AutoDetect;

@AutoDetect
public class CommonModuleStaticSettings extends AbstractFlowCentralStaticSettings {

	public CommonModuleStaticSettings() {
		super("com.example.myapp.resources.common-messages", ModuleInstallLevelConstants.COMMON_MODULE_LEVEL);
	}

}
