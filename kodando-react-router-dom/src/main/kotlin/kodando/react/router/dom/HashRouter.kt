package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 24/04/17.
 */


fun ReactProps.hashRouter(props: HashRouterProps = createProps(),
                          configure: Configurer<HashRouterProps>) {
  addComponent(Module.HashRouterClass, props.configureBy(configure))
}
