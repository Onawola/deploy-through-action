package com.example.myapp.web.controller;

import com.flowcentraltech.flowcentral.common.web.controllers.AbstractFlowCentralPageController;
import com.tcdng.unify.web.constant.ReadOnly;
import com.tcdng.unify.web.constant.ResetOnWrite;
import com.tcdng.unify.web.constant.Secured;

public abstract class AbstractCommonPageController<T extends AbstractCommonPageBean> extends AbstractFlowCentralPageController<T> {

	public AbstractCommonPageController(Class<T> pageBeanClass, Secured secured, ReadOnly readOnly,ResetOnWrite resetOnWrite) {
		super(pageBeanClass, secured, readOnly, resetOnWrite);
	}

}
