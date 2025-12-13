package com.example.myapp.business;

import com.flowcentraltech.flowcentral.application.business.AppletUtilities;
import com.flowcentraltech.flowcentral.application.business.ApplicationModuleService;
import com.flowcentraltech.flowcentral.common.business.AbstractFlowCentralService;
import com.flowcentraltech.flowcentral.system.business.SystemModuleService;
import com.tcdng.unify.core.UnifyException;
import com.tcdng.unify.core.annotation.Configurable;

public abstract class AbstractCommonModuleService extends AbstractFlowCentralService {

	@Configurable
	private AppletUtilities appletUtilities;

	@Override
	public void clearDefinitionsCache() throws UnifyException {

	}

	protected final SystemModuleService system() {
		return appletUtilities.system();
	}

	protected final ApplicationModuleService application() {
		return appletUtilities.application();
	}

	protected final AppletUtilities au() {
		return appletUtilities;
	}

}
