package com.github.raftimpl.raft.service;

import com.github.raftimpl.raft.proto.RaftProto;

public interface RaftClientService {

    /**
     * 获取raft集群leader节点信息
     * @param request 请求
     * @return leader节点
     */
    RaftProto.GetLeaderResponse getNowLeader(RaftProto.GetLeaderRequest request);

    /**
     * 获取raft集群所有节点信息。
     * @param request 请求
     * @return raft集群各节点地址，以及主从关系。
     */
    RaftProto.GetConfigurationResponse getConfig(RaftProto.GetConfigurationRequest request);

    /**
     * 向raft集群添加节点。
     * @param request 要添加的节点信息。
     * @return 成功与否。
     */
    RaftProto.AddPeersResponse addStoragePeers(RaftProto.AddPeersRequest request);

    /**
     * 从raft集群删除节点
     * @param request 请求
     * @return 成功与否。
     */
    RaftProto.RemovePeersResponse removeStoragePeers(RaftProto.RemovePeersRequest request);
}
