package com.tfckr.rxbase.android.libs;

import com.trello.rxlifecycle.android.ActivityEvent;

import rx.Observable;

/**
 * A type implements this interface when it can describe its lifecycle in terms of
 * creation, starting, stopping and destroying.
 */
public interface ActivityLifecycleType {

    /**
     * An observable that describes the lifecycle of the object, from CREATE to DESTROY.
     */
    Observable<ActivityEvent> lifecycle();
}
