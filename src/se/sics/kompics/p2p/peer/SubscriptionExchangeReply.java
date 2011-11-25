package se.sics.kompics.p2p.peer;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import p2p.system.peer.PeerAddress;

public class SubscriptionExchangeReply extends PeerMessage {

	private static final long serialVersionUID = 1381490582457993230L;
	private final PeerAddress responsible;
	private int friendIndex;
	private Set<BigInteger> subscriptionList = new HashSet<BigInteger>();	

//-------------------------------------------------------------------	
	public SubscriptionExchangeReply(PeerAddress source, PeerAddress destination, PeerAddress responsible, int friendIndex, Set<BigInteger> subscriptionList) {
		super(source, destination);
		this.responsible = responsible;
		this.friendIndex = friendIndex;
		this.subscriptionList = subscriptionList;
	}

//-------------------------------------------------------------------	
	public PeerAddress getResponsible() {
		return this.responsible;
	}

//-------------------------------------------------------------------	
	public int getFriendIndex() {
		return this.friendIndex;
	}
	
	public Set<BigInteger> getSubscriptionList() {
		return this.subscriptionList;
	}
	
}

