
# CHANGELOG

## May 10, 2018

- **kodando-rxjs**:
    - [NEW] Added operator `catchError`;
    - [NEW] Added the extension methods `Observable<T>.subscribeNext` and `Observable<T>.tapNext`.
    
### Project version

- kodando-elmish:               `0.4.1`;
- kodando-elmish-react:         `0.4.0`;
- kodando-history:              `0.3.0`;
- kodando-jest:                 `0.5.0`;
- kodando-mithril:              `1.2.0`;
- kodando-mithril-router-dom:   `4.3.0`;
- kodando-react:                `0.5.0`;
- kodando-react-dom:            `0.5.0`;
- kodando-react-native:         `0.4.0`;
- kodando-react-router-dom:     `0.4.0`;
- kodando-redurx:               `0.4.1`;
- kodando-runtime:              `0.4.1`;
- kodando-rxjs:                 `0.6.1`;

## May 09, 2018

- **kodando-runtime**:
    - [FIX] Cosmetic use of the `Promise.then`;
    - [FIX] Added an extension method for chaining promises `Promise.thenNext`;
    
- **kodando-rxjs**:
    - [BREAKING CHANGE] Upgraded to match the version `6.1.0`;
    - [BREAKING CHANGE] Renamed package `kodando.rxjs.operator` to `kodando.rxjs.operators`;
    - [BREAKING CHANGE] Removed the `ObservableClass`. Now you should use the same observable creators like in `Rxjs`;
    - [NEW] Added the extension method `Observable<T>.subscribeWith` that creates an `ObserverLike<T>` to be configured:
        ```kotlin
        subscription = myObservable.subscribeWith {
          next = {
              console.log("NEXT ITEM", it)
          }
          error = {
              console.log("PRODUCED ERROR", it)
          }
          complete = {
              console.log("WHEN COMPLETED")
          }
        }
        ```
    - [NEW] Added the extension method `Observable<T>.tapWith` (same usage as the `subscribeWith`).
    
- **kodando-elmish**:
    - [BREAKING CHANGE] Update to match the last `kodando-rxjs`;
    
- **kodando-redurx**:
    - [BREAKING CHANGE] Update to match the last `kodando-rxjs`.
    
### Project version

- kodando-elmish:               `0.4.1`;
- kodando-elmish-react:         `0.4.0`;
- kodando-history:              `0.3.0`;
- kodando-jest:                 `0.5.0`;
- kodando-mithril:              `1.2.0`;
- kodando-mithril-router-dom:   `4.3.0`;
- kodando-react:                `0.5.0`;
- kodando-react-dom:            `0.5.0`;
- kodando-react-native:         `0.4.0`;
- kodando-react-router-dom:     `0.4.0`;
- kodando-redurx:               `0.4.1`;
- kodando-runtime:              `0.4.1`;
- kodando-rxjs:                 `0.6.0`;


## May 06, 2018

- **all projects**: 
    - [BREAKING CHANGE] Updated kotlin compiler to `1.2.41`;
- **kodando-mithril**:
    - [BREAKING CHANGE] Renamed method `OnBeforeUpdate<TProps>.onUpdate` to `OnBeforeUpdate<TProps>.onBeforeUpdate`;
    - [BREAKING CHANGE] Renamed interface `BeforeRemove<TProps>` to `OnBeforeRemove<TProps>`;
    - [BREAKING CHANGE] Renamed interface `BeforeRemoveAsync<TProps>` to `OnBeforeRemoveAsync<TProps>`.

### Project version

- kodando-elmish:               `0.4.0`;
- kodando-elmish-react:         `0.4.0`;
- kodando-history:              `0.3.0`;
- kodando-jest:                 `0.5.0`;
- kodando-mithril:              `1.2.0`;
- kodando-mithril-router-dom:   `4.3.0`;
- kodando-react:                `0.5.0`;
- kodando-react-dom:            `0.5.0`;
- kodando-react-native:         `0.4.0`;
- kodando-react-router-dom:     `0.4.0`;
- kodando-redurx:               `0.4.0`;
- kodando-runtime:              `0.4.0`;
- kodando-rxjs:                 `0.5.0`;
