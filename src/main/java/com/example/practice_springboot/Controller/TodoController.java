package com.example.practice_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class TodoController {

    // コンソール版と同じ！タスクを保存する箱
    private ArrayList<String> todoList = new ArrayList<>();

    // 1. リストの中身を見る機能
    // URL: http://localhost:8080/list
    @GetMapping(value = "/list", produces = "application/json; charset=UTF-8")
    public ArrayList<String> getList() {
        return todoList;
    }

    // 2. タスクを追加する機能
    // URL: http://localhost:8080/add?task=掃除
    @GetMapping("/add")
    public String addTask(@RequestParam("task") String task) {
        todoList.add(task);
        return "「" + task + "」をリストに追加しました！";
    }
}
