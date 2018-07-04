/*
 * Copyright (C) 2004-2018 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.gameserver.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Мо3олЬ
 */
public class TranslationMessage
{
	private final Map<String, String> _messages = new HashMap<>();
	private final String _id;
	
	public TranslationMessage(String id)
	{
		_id = id;
	}
	
	public void addNewMessage(String lang, String message)
	{
		_messages.put(lang, message);
	}
	
	public String getTranslationId()
	{
		return _id;
	}
	
	public String getMessageByLang(String lang)
	{
		return _messages.get(lang);
	}
}