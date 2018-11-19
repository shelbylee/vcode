<template>
  <v-app>
    <v-toolbar dark clipped-left app>header</v-toolbar>
    <v-navigation-drawer clipped app>asider</v-navigation-drawer>
    <v-content>
      <v-container fluid>
        <router-view></router-view>
      </v-container>
    </v-content>
    <v-footer app>footer</v-footer>
  </v-app>
</template>

<script>
export default {
  data() {
    return {};
  }
};
</script>
