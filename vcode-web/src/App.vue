<template>
  <v-app id="app" v-cloak>
    <v-navigation-drawer v-model="asider" width="250" dark clipped app>
      <v-list>
        <v-list-tile to="/">
          <v-list-tile-action>
            <v-icon>dashboard</v-icon>
          </v-list-tile-action>
          <v-list-tile-content>
            <v-list-tile-title>首页</v-list-tile-title>
          </v-list-tile-content>
        </v-list-tile>
        <v-list-tile to="/problem">
          <v-list-tile-action>
            <v-icon>dashboard</v-icon>
          </v-list-tile-action>
          <v-list-tile-content>
            <v-list-tile-title>题目</v-list-tile-title>
          </v-list-tile-content>
        </v-list-tile>
        <v-list-tile to="/submission">
          <v-list-tile-action>
            <v-icon>dashboard</v-icon>
          </v-list-tile-action>
          <v-list-tile-content>
            <v-list-tile-title>提交</v-list-tile-title>
          </v-list-tile-content>
        </v-list-tile>
        <v-list-tile to="/contest">
          <v-list-tile-action>
            <v-icon>dashboard</v-icon>
          </v-list-tile-action>
          <v-list-tile-content>
            <v-list-tile-title>比赛</v-list-tile-title>
          </v-list-tile-content>
        </v-list-tile>
      </v-list>
    </v-navigation-drawer>

    <v-toolbar color="blue-grey darken-2" dense dark clipped-left app>
      <v-toolbar-side-icon @click="asider = !asider"></v-toolbar-side-icon>
      <v-toolbar-title>VCode - 在线编程平台</v-toolbar-title>
      <v-spacer></v-spacer>
      <v-toolbar-items>
        <v-btn flat href="http://www.baidu.com" target="_blank">优化案例</v-btn>
        <v-btn flat href="http://www.baidu.com" target="_blank">使用文档</v-btn>
        <v-btn flat href="http://www.baidu.com" target="_blank">需求反馈</v-btn>
        <v-btn flat href="http://www.baidu.com" target="_blank">使用协议</v-btn>
        <v-menu>
          <v-btn flat slot="activator">
            <v-icon>account_circle</v-icon>&nbsp;&nbsp;张业祥
          </v-btn>
          <v-list dense>
            <v-list-tile>
              <v-list-tile-action>
                <v-icon>exit_to_app</v-icon>
              </v-list-tile-action>
              <v-list-tile-content>
                <v-list-tile-title>退出</v-list-tile-title>
              </v-list-tile-content>
            </v-list-tile>
          </v-list>
        </v-menu>
      </v-toolbar-items>
    </v-toolbar>

    <v-content>
      <v-container fluid>
        <router-view></router-view>
      </v-container>
    </v-content>
  </v-app>
</template>

<script>
export default {
  data: function() {
    return {
      asider: true
    };
  }
};
</script>
