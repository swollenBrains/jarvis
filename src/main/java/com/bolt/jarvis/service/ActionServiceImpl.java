package com.bolt.jarvis.service;

import com.bolt.jarvis.entity.Action;
import com.bolt.jarvis.entity.Rule;

import java.util.Arrays;
import java.util.List;

public class ActionServiceImpl implements ActionService {

    public Action getAction(String query) {
        List<String> keywords = getKeywords(query);
        // call into ruleRepository to get rule
        // Rule rule = getRule(keywords);
        return null;
    }

    private List<String> getKeywords(String query) {
        return Arrays.asList(query.split(" "));
    }

}
