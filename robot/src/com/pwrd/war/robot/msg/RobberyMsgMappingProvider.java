package com.pwrd.war.robot.msg;

import java.util.HashMap;
import java.util.Map;

import com.pwrd.war.core.msg.MessageType;
import com.pwrd.war.common.MessageMappingProvider;

import com.pwrd.war.gameserver.robbery.msg.CGRobberyIndex;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyIndex;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyIndexAdd;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyDetailInfo;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyDetailInfo;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyPlyaerIndex;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyPlyaerIndex;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyFriendList;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyFriendList;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyInviteFriend;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyBeFriendInviteFriend;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyBeInviteFriend;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyInviteFriend;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyRefresh;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyStart;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyEnd;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyProtectEnd;
import com.pwrd.war.gameserver.robbery.msg.CGRobberyRob;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyRobResult;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyRob;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyBeRob;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyProtectBeRob;
import com.pwrd.war.gameserver.robbery.msg.GCRobberyBeRobNew;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class RobberyMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_ROBBERY_INDEX, CGRobberyIndex.class);
		map.put(MessageType.GC_ROBBERY_INDEX, GCRobberyIndex.class);
		map.put(MessageType.GC_ROBBERY_INDEX_ADD, GCRobberyIndexAdd.class);
		map.put(MessageType.CG_ROBBERY_DETAIL_INFO, CGRobberyDetailInfo.class);
		map.put(MessageType.GC_ROBBERY_DETAIL_INFO, GCRobberyDetailInfo.class);
		map.put(MessageType.CG_ROBBERY_PLYAER_INDEX, CGRobberyPlyaerIndex.class);
		map.put(MessageType.GC_ROBBERY_PLYAER_INDEX, GCRobberyPlyaerIndex.class);
		map.put(MessageType.CG_ROBBERY_FRIEND_LIST, CGRobberyFriendList.class);
		map.put(MessageType.GC_ROBBERY_FRIEND_LIST, GCRobberyFriendList.class);
		map.put(MessageType.CG_ROBBERY_INVITE_FRIEND, CGRobberyInviteFriend.class);
		map.put(MessageType.GC_ROBBERY_BE_FRIEND_INVITE_FRIEND, GCRobberyBeFriendInviteFriend.class);
		map.put(MessageType.CG_ROBBERY_BE_INVITE_FRIEND, CGRobberyBeInviteFriend.class);
		map.put(MessageType.GC_ROBBERY_INVITE_FRIEND, GCRobberyInviteFriend.class);
		map.put(MessageType.CG_ROBBERY_REFRESH, CGRobberyRefresh.class);
		map.put(MessageType.CG_ROBBERY_START, CGRobberyStart.class);
		map.put(MessageType.GC_ROBBERY_END, GCRobberyEnd.class);
		map.put(MessageType.GC_ROBBERY_PROTECT_END, GCRobberyProtectEnd.class);
		map.put(MessageType.CG_ROBBERY_ROB, CGRobberyRob.class);
		map.put(MessageType.GC_ROBBERY_ROB_RESULT, GCRobberyRobResult.class);
		map.put(MessageType.GC_ROBBERY_ROB, GCRobberyRob.class);
		map.put(MessageType.GC_ROBBERY_BE_ROB, GCRobberyBeRob.class);
		map.put(MessageType.GC_ROBBERY_PROTECT_BE_ROB, GCRobberyProtectBeRob.class);
		map.put(MessageType.GC_ROBBERY_BE_ROB_NEW, GCRobberyBeRobNew.class);
		return map;
	}

}