
# CHANGELOG

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


## May 06, 2018

**Breaking change**:

- **all projects**: 
    - Updated kotlin compiler to `1.2.41`;
- **kodando-mithril**:
    - Renamed method `OnBeforeUpdate<TProps>.onUpdate` to `OnBeforeUpdate<TProps>.onBeforeUpdate`;
    - Renamed interface `BeforeRemove<TProps>` to `OnBeforeRemove<TProps>`;
    - Renamed interface `BeforeRemoveAsync<TProps>` to `OnBeforeRemoveAsync<TProps>`.

**Project version**:

- kodando-elmish: `0.3.0` to `0.4.0`;
- kodando-elmish-react: `0.3.0` to `0.4.0`;
- kodando-history: `0.2.1` to `0.3.0`;
- kodando-jest: `0.4.0` to `0.5.0`;
- kodando-mithril: `1.1.3` to `1.2.0`;
- kodando-mithril-router-dom: `4.2.3` to `4.3.0`;
- kodando-react: `0.4.0` to `0.5.0`;
- kodando-react-dom: `0.4.0` to `0.5.0`;
- kodando-react-native: `0.3.0` to `0.4.0`;
- kodando-react-router-dom: `0.3.1` to `0.4.0`;
- kodando-redurx: `0.3.0` to `0.4.0`;
- kodando-runtime: `0.3.1` to `0.4.0`;
- kodando-rxjs: `0.4.1` to `0.5.0`;

