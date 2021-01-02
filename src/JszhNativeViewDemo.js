/**
 * Created by jszh on 2021/1/2.
 */

'use strict';

import React, {Component} from 'react';
import {requireNativeComponent} from 'react-native';

const NativeViewDemo = requireNativeComponent('NativeViewDemo');

export default class JszhNativeViewDemo extends Component {

    render() {
        return (
            <NativeViewDemo {...this.props}/>
        );
    }
}
