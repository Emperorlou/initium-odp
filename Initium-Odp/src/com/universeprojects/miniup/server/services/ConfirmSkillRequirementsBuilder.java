package com.universeprojects.miniup.server.services;

import com.universeprojects.cacheddatastore.CachedEntity;
import com.universeprojects.miniup.server.ODPDBAccess;
import com.universeprojects.miniup.server.OperationBase;

public class ConfirmSkillRequirementsBuilder extends ConfirmGenericEntityRequirementsBuilder
{
	final private CachedEntity skill;
	
	public ConfirmSkillRequirementsBuilder(String uniqueId, ODPDBAccess db, OperationBase command, CachedEntity ideaDef, CachedEntity skill)
	{
		super(uniqueId, db, command, "doConstructItemSkill(null, "+skill.getId()+", "+skill.getProperty("name")+", '"+uniqueId+"')", ideaDef);
		this.skill = skill;
	}
	
	protected String getPagePopupUrl()
	{
		return "/odp/confirmrequirements?constructItemSkillId="+skill.getId();
	}


	@Override
	protected String getPagePopupTitle()
	{
		return "Select the tools/materials to use";
	}

}
