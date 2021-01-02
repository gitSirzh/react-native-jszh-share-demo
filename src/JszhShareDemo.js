/**
 * Created by jszh on 2021/1/2.
 */

'use strict';

import React from 'react';
import {NativeModules} from 'react-native';

const {JszhShareDemo} = NativeModules;

export default new class NativeDemo {

    alert(data) {
        JszhShareDemo.alert(data);
    }

    callbackData(callback) {
        JszhShareDemo.callbackData().then((data => callback(data)));
    }

};
