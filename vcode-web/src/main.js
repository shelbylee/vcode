import Vue from "vue"
import VueRouter from "vue-router"
import Vuetify from "vuetify/lib"
import App from "./App.vue"
import Home from "./components/Home.vue"
import ProblemList from "./components/ProblemList.vue"
import Problem from "./components/Problem.vue"
import "vuetify/src/stylus/app.styl"

Vue.config.productionTip = false
Vue.use(VueRouter)
Vue.use(Vuetify, { iconfont: "md" })

new Vue({
  router: new VueRouter({
    routes: [
      { path: "/", component: Home },
      { path: "/problem", component: ProblemList },
      { path: "/problem/:id", component: Problem },
    ]
  }),
  render: h => h(App)
}).$mount("#app")
