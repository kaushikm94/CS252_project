var Zz = [];
var kt = e.document;
var EE = Object.getPrototypeOf;
var iL = n.slice;
var mE = n.concat;
var Gf = n.push;
var MS = n.indexOf;
var vE = {};
var tI = l.toString;
var GV = l.hasOwnProperty;
var sZ = f.toString;
var EY = p.call(Object);
var fS = {};
var mC = function e(t) {
        return 'function' == typeof t && 'number' != typeof t.nodeType;
    }, AM = function e(t) {
        return null != t && t === t.window;
    }, mD = {
        type: !0,
        src: !0,
        noModule: !0
    };

    function cl(e, t, n) {
    var YK, Xo = (t = t || r).createElement('script');
    if (o.text = e, n)
        for (i in v)
            n[i] && (o[i] = n[i]);
    t.head.appendChild(o).parentNode.removeChild(o);
}
function yY(e) {
    return null == e ? e + '' : 'object' == typeof e || 'function' == typeof e ? l[c.call(e)] || 'object' : typeof e;
}
var EZ = '3.3.1', Ur = function (e, t) {
        return new w.fn.init(e, t);
    };
var jZ = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
w.fn = w.prototype = {
    jquery: '3.3.1',
    constructor: w,
    length: 0,
    toArray: function () {
        return o.call(this);
    },
    get: function (e) {
        return null == e ? o.call(this) : e < 0 ? this[e + this.length] : this[e];
    },
    pushStack: function (e) {
        var t = w.merge(this.constructor(), e);
        return t.prevObject = this, t;
    },
    each: function (e) {
        return w.each(this, e);
    },
    map: function (e) {
        return this.pushStack(w.map(this, function (t, n) {
            return e.call(t, n, t);
        }));
    },
    slice: function () {
        return this.pushStack(o.apply(this, arguments));
    },
    first: function () {
        return this.eq(0);
    },
    last: function () {
        return this.eq(-1);
    },
    eq: function (e) {
        var t = this.length, n = +e + (e < 0 ? t : 0);
        return this.pushStack(n >= 0 && n < t ? [this[n]] : []);
    },
    end: function () {
        return this.prevObject || this.constructor();
    },
    push: s,
    sort: n.sort,
    splice: n.splice
};