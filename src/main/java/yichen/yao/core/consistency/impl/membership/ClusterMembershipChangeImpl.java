package yichen.yao.core.consistency.impl.membership;

import yichen.yao.core.consistency.Node;
import yichen.yao.core.consistency.ClusterMembershipChange;
import yichen.yao.core.consistency.impl.DefaultConsensusImpl;

/**
 * @Author: siran.yao
 * @time: 2020/2/15:下午12:34
 * 集群成员变更实现
 */
public class ClusterMembershipChangeImpl extends DefaultConsensusImpl implements ClusterMembershipChange{

    @Override
    public void addServerToCluster(Node node) {

    }

    @Override
    public void removeServerFromCluster(Node node) {

    }
}
