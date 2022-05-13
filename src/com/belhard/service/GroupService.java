package com.belhard.service;

import com.belhard.model.Group;
import com.belhard.repository.GroupRepository;

import java.util.Arrays;
import java.util.List;

public class GroupService {
    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }
    public void removeGroups (List<Group> removeGroups) {
        removeGroups.forEach(gr -> System.out.println(gr));
        groupRepository.removeGroups(removeGroups);
    }
    public void addGroups(List<Group> newGroups){
        newGroups.forEach(gr -> System.out.println(gr));
        groupRepository.addGroups(newGroups);
    }


// добавить метод изминения группы
//
}
