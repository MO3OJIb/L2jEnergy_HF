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
package com.l2jserver.gameserver.network.serverpackets;

import com.l2jserver.gameserver.model.actor.instance.L2PcInstance;

public class ExBR_GamePoint extends L2GameServerPacket
{
	private final int _charId;
	private final long _points;
	
	public ExBR_GamePoint(L2PcInstance activeChar)
	{
		_charId = activeChar.getObjectId();
		_points = activeChar.getPrimePoints();
	}
	
	@Override
	public void writeImpl()
	{
		writeC(0xFE);
		writeH(0xD5);
		writeD(_charId);
		writeQ(_points);
		writeD(0x00);
	}
}
