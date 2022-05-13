package com.belhard.repository;

import com.belhard.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    public void removeGroups (List<Group> removeGroups){
        groups.removeAll(removeGroups);
    }
    public void addGroups (List<Group> newGroups){
        groups.addAll(newGroups);
    }
    public List<Group> getGroups(){
        return groups;
    }
}