import Vue from "vue";
import Vuetify from "vuetify";
import VueRouter from "vue-router";

import App from "./App.vue";
import Home from "./components/Home.vue";
import ProblemList from "./components/ProblemList.vue";
import Problem from "./components/Problem.vue";

import "vuetify/dist/vuetify.min.css";
import "material-design-icons-iconfont/dist/material-design-icons.css";

Vue.use(Vuetify);
Vue.use(VueRouter);
Vue.config.productionTip = false;

new Vue({
    render: h => h(App),
    router: new VueRouter({
    routes: [
      { path: "/", component: Home },
      { path: "/problem", component: ProblemList },
      { path: "/problem/:id", component: Problem },
    ]
  })
}).$mount("#app");
