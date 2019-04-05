# -*- coding: utf-8 -*-

# mongo FS
import gridfs

import six
from flask import Flask, jsonify, abort, request, make_response, url_for
from flask_httpauth import HTTPBasicAuth

from api.controller import Controller

from pymongo import MongoClient



if __name__ == '__main__':

    mongo = MongoClient('mongodb://localhost:27017/')['mycollection']
    controller = Controller(mongo)

    controller.run()
