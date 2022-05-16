package com.belhard.service;

import com.belhard.model.Group;
import com.belhard.model.Student;
import com.belhard.repository.GroupRepository;

import java.util.ArrayList;
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

    public void groupChenge(List<Group>groups ){
    Group group = new Group();
    List<Group> groups = new ArrayList<>();
        groups.add(group);
        GroupService groupService;
        groupService.addGroups(groups);

}
}
