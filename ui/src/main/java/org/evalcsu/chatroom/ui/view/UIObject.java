package org.evalcsu.chatroom.ui.view;

import javafx.scene.Parent;
import javafx.stage.Stage;

public abstract class UIObject extends Stage {

    protected Parent root;

    /**
     * 初始化窗口
     */
    public abstract void initView();

    /**
     * 初始化事件定义
     */
    public abstract void initEventDefine();
}